# Calculadora Vista-Controlador

Se trata de una calculadora estándar que realiza las operaciones logicas de sumar/restar/multiplicar/dividir controlando de que se meten numeros adecuados asi como controlando operaciones infinitas.

Este modelo se basa en que cada JSP o .java tiene su propia funcionalidad y se comunican entre ellas para dar lugar a un resultado o informacion. Estas clases son:

-index.jsp:
Pagina principal que tiene el primer contacto visual con el usuario y que mandara este formulario a un Controlador.java que se encargara de que mete numeros numeros y se puede hacer la operacion.

-Controlador.java:

DoGet() si se intenta acceder sin pasar por el formulario de entrada(es decir, lo estoy llamando o a traves de un enlace), daria un fallo y se volveria de nuevo hacia el index.

DoPost() cuando pasa por el formulario de entrada, y a partir de aqui se hace la logica. 
Meto todo en un try/catch para controlar aquellas excepciones que pueden dar lugar a una parada del programa, y trato de recoger cuando mete caracteres o bien se deja en blanco. Para el caso de la division por cero, es una excepcion creada por mi en la que lanza esta excepcion hasta este fragmento de codigo.
Para cada una de las operaciones de sumar/restar/multiplicar/dividir, se crea un objeto de la clase Sumador/Restador/Multiplicador/Divisor. Previamente, tendremos una instanciacion de Calculator en la que se va a recoger los operandos, resultado y signo. En el caso de que salte excepcion va a parar a un JSP "error.jsp" y si esta correcto va a parar al JSP "resultado.jsp". A la hora de pasarnos de una pagina a otra lo haremos con un getRequestDispatcher(). 

-error.jsp:
Muestra un mensaje de informacion de error y un enlace para volver de nuevo al index.jsp.

-resultado.jsp:
Salida de informacion de la operacion logica introducida por el usuario y un enlace para volver de nuevo a la pagina principal.

NOTA: en cuanto a la hora del paso de parametros lo hago a traves de un atributo de peticion en el que meto un objeto de la clase Calculator con toda la informacion relevante.
