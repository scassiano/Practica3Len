import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
public class Traduccion extends GramaticaCoralBaseListener {

    //Tabla de simbolos para saber tipo de variables
    HashMap<String, String> table = new HashMap<>();

    //Tabla para saber que variables son array
    HashMap<String, Boolean> arrayTable = new HashMap<>();

    //Nombre variable que se esta asignando actualmente
    String currentVariable = new String();

    //Saber si se esta haciendo una asignacion del size de un arreglo
    Boolean sizeAssign = new Boolean(false);

    //Variable para conocer indentacion de un for
    Integer indentationFor = new Integer(0);

    //Variable para saber que retorna una funcion que esta siendo definida
    String returnVariable = new String("");

    //Saber si se creo una funcion main y es necesario llamarla al final
    Boolean mainExists = new Boolean(false);


    @Override
    public void enterInit(GramaticaCoralParser.InitContext ctx) {
        /** Agregar los imports para las funciones predeterminadas*/
        System.out.println("import math");
        System.out.println("import random");
    }

    @Override
    public void exitInit(GramaticaCoralParser.InitContext ctx){
        //Llamar al main si existe
        if(mainExists){
            System.out.println("");
            System.out.print("Main()");
        }
    }

    @Override
    public void enterCommand(GramaticaCoralParser.CommandContext ctx){
        //Se reinicia contador para indentaciones de un for
        indentationFor = 0;

        //Verificar si el comando tiene indentacion
        if(ctx.newlinespaces().NEWLINESPACES() != null){
            //Si tiene indentacion recorriendo hacia atras la cadena
            for (int i = (ctx.newlinespaces().NEWLINESPACES().getText().length())-1; i >= 0; i--) {
                if(ctx.newlinespaces().NEWLINESPACES().getText().charAt(i) == '\n'){
                    break;
                } else {
                    //Aumentar contador de indentaciones si se cuenta un for
                    if(ctx.forsentence() != null){
                        //Se van a contar indentaciones de un for
                        indentationFor = indentationFor + 1;
                    }
                    //Imprimir un espacio
                    System.out.print(" ");
                }
            }
        }
    }

    @Override
    public void exitComment(GramaticaCoralParser.CommentContext ctx){
        System.out.println("");

    }

    @Override
    public void enterNewlinespaces(GramaticaCoralParser.NewlinespacesContext ctx){
        //System.out.print(ctx.NEWLINESPACES().getText());
    }

    @Override
    public void enterIf(GramaticaCoralParser.IfContext ctx){
        //Imprimir palabra if con un espacio
        System.out.print("if ");
    }

    @Override
    public void exitIf(GramaticaCoralParser.IfContext ctx){
        //Imprimir una salto de linea
        System.out.println();
    }

    @Override
    public void enterElseif(GramaticaCoralParser.ElseifContext ctx){
        //Imprimir para elif con un espacio
        System.out.print("elif ");
    }

    @Override
    public void exitElseif(GramaticaCoralParser.ElseifContext ctx){
        //Imprimir un salto de linea
        System.out.println();
    }

    @Override
    public void exitCondexpr(GramaticaCoralParser.CondexprContext ctx){
        //Verificar si el padre es una regla if o una regla elseif
        if(ctx.getParent() instanceof GramaticaCoralParser.IfContext || ctx.getParent() instanceof GramaticaCoralParser.ElseifContext || ctx.getParent() instanceof GramaticaCoralParser.WhileContext){
            //Imprimir : al final de la sentencia y una nueva linea
            System.out.print(":");
        }
    }

    @Override
    public void enterElse(GramaticaCoralParser.ElseContext ctx){
        //Imprimir else: y un salto de linea
        System.out.println("else:");
    }

    @Override
    public void enterWhile(GramaticaCoralParser.WhileContext ctx){
        //Imprimir while con un espacio
        System.out.print("while ");
    }

    @Override
    public void exitWhile(GramaticaCoralParser.WhileContext ctx){
        //Imprimir un salto de linea
        System.out.println();
    }

    @Override
    public void enterForsentence(GramaticaCoralParser.ForsentenceContext ctx){
        //La indentacion ya se imprimio previamente
        //Imprimir un boolean para controlar ejecucion del for
        System.out.println("_booleanFor =  False");
        //Imprimir indentacion antes de sentencia de asignacion del for
        for (int i = 0; i < indentationFor; i++) {
            System.out.print(" ");
        }
        // La sentencia de asignacion del for se imprime sola
    }

    @Override
    public void enterSemicolonfor1(GramaticaCoralParser.Semicolonfor1Context ctx){
        //Imprimir while con indentacion al nivel del for que va a simular
        for (int i = 0; i < indentationFor; i++) {
            System.out.print(" ");
        }
        //Imprimir palabra while y un espacio
        System.out.print("while ");

        //La expresion condicional se imprime sola
    }

    @Override
    public void enterSemicolonfor2(GramaticaCoralParser.Semicolonfor2Context ctx){
        //Imprimir dos puntos y un salto de linea despues de expresion condicional
        System.out.println(":");

        //Imprimir la indentacion del for + 3 con un condicional para controlar ejecucion del for
        for (int i = 0; i < indentationFor+3; i++) {
            System.out.print(" ");
        }
        //Imprimir un condicional para controlar la primera ejecucion
        //Imprime salto de linea tambien
        System.out.println("if _booleanFor:");

        //Imprimir la indentacion del for + 6 espacios
        //Para indentacion de la expresion de asignacion de actualizacion
        //Imprimir la indentacion del for + 3 con un condicional para controlar ejecucion del for
        for (int i = 0; i < indentationFor+6; i++) {
            System.out.print(" ");
        }

        //La expresion de asignacion se imprime sola
    }

    @Override
    public void exitForsentence(GramaticaCoralParser.ForsentenceContext ctx){
        //Imprimir indentacion del for + 3 para actualizar la variable booleana
        for (int i = 0; i < indentationFor+3; i++) {
            System.out.print(" ");
        }

        //Imprimir la actualizacion a la variable booleana
        //Se imprime un salto de linea tambien
        System.out.println("_booleanFor = True");

        //Imprimir indentacion del for + 3 para una condicion
        for (int i = 0; i < indentationFor+3; i++) {
            System.out.print(" ");
        }

        //Imprimir inicio del condicional de control
        System.out.print("if not(");

        //Imprimir expresion condicional
        //Volviendo a llamar su regla con ayuda de un walker
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Traduccion(), ctx.condexpr());

        //Imprimir un parentesis de cerrado y dos puntos
        //Imprimir salto de linea
        System.out.println("):");

        //Imprimir indentacion del for + 6 para una condicion
        //De ruptura del ciclo en el momento que se incumpla la condicion
        for (int i = 0; i < indentationFor+6; i++) {
            System.out.print(" ");
        }

        //Imprimir sentencia break con salto de linea
        System.out.println("break");
    }

    @Override
    public void enterFunctiondef(GramaticaCoralParser.FunctiondefContext ctx){
        //Verificar si se definio antes una funcion y retornaba algo
        //Para imprimir la sentencia de return de la anterior funcion
        if( returnVariable.compareTo("") != 0){
            //Entonces si toca hacer una sentencia de return de dicha variable
            //Este return siempre tiene 3 espacios de indentacion
            System.out.print("   ");
            System.out.print("return ");
            System.out.println(returnVariable);

            //La return variable se vuelve a dejar como cadena vacia
            returnVariable = "";
        }

        //Imprimir la palabra def y un espacio para python
        System.out.print("def ");
        // Imprimir el primer identificador
        System.out.print(ctx.IDENTIFIER(0).getText());

        //Reconocer si el identificador de la funcion es Main, para saber que
        // hay que ejecutarla
        if(ctx.IDENTIFIER(0).getText().compareTo("Main") == 0){
            mainExists = true;
        }

        //Luego se imprime solo el parentesis izquierdo
    }

    @Override
    public void exitFunctiondef(GramaticaCoralParser.FunctiondefContext ctx){
        //Imprimir los dos puntos de python
        System.out.println(":");
        //Verificar si hace return diferente de nothing para almacenar lo que retorna
        if(ctx.NOTHING() == null){
            //Almacenar la variable de salida en la tabla de simbolos
            table.put(ctx.IDENTIFIER(1).getText(), ctx.TYPE().getText());
            //Almacenar si la variable es un arreglo o no
            if(ctx.ARRAY() != null){
                arrayTable.put(ctx.IDENTIFIER(1).getText(), true);
            } else {
                arrayTable.put(ctx.IDENTIFIER(1).getText(), false);
            }

            //Indicar que esa sera la variable que se debe retornar de esta funcion
            returnVariable = ctx.IDENTIFIER(1).getText();
        }
    }

    @Override
    public void enterParameters(GramaticaCoralParser.ParametersContext ctx){
        //Imprimir identificadores solo si tiene IDENTIFIER, y almacenar su tipo
        if(ctx.IDENTIFIER() != null){
            System.out.print(ctx.IDENTIFIER().getText());
            //Almacenar en la tabla segun tipo de dato del identificador
            table.put(ctx.IDENTIFIER().getText(), ctx.TYPE().getText());
            //Almacenar si la variable es un arreglo o no
            if(ctx.ARRAY() != null){
                arrayTable.put(ctx.IDENTIFIER().getText(), true);
            } else {
                arrayTable.put(ctx.IDENTIFIER().getText(), false);
            }
        }
    }

    @Override
    public void exitParametersprima(GramaticaCoralParser.ParametersprimaContext ctx){
        //Imprimir identificadores solo si tiene IDENTIFIER, y almacenar su tipo
        if(ctx.identifier() != null){
            //El identificador se imprime solo en su momento
            //Almacenar en la tabla segun tipo de dato del identificador
            table.put(ctx.identifier().IDENTIFIER().getText(), ctx.TYPE().getText());
            //Almacenar si la variable es un arreglo o no
            if(ctx.ARRAY() != null){
                arrayTable.put(ctx.identifier().IDENTIFIER().getText(), true);
            } else {
                arrayTable.put(ctx.identifier().IDENTIFIER().getText(), false);
            }
        }
    }

    @Override
    public void enterDeclaration(GramaticaCoralParser.DeclarationContext ctx) {

        //Declarar nombre de la variable
        System.out.print(ctx.IDENTIFIER().getText() + "=");

        //Almacenar en la tabla segun tipo de dato del identificador
        table.put(ctx.IDENTIFIER().getText(), ctx.TYPE().getText());
        //Almacenar si la variable es un array o no
        if(ctx.ARRAY() != null){
            arrayTable.put(ctx.IDENTIFIER().getText(), true);
        } else {
            arrayTable.put(ctx.IDENTIFIER().getText(), false);
        }

        if(ctx.ARRAY() != null){
            /** Declarar un array float o integer */
            System.out.print("[");
            if(ctx.size().getText().compareTo("?") != 0){
                //Si la longitud del arreglo NO es signo de interrogacion
                if (ctx.TYPE().getText().compareTo("integer") == 0){
                    System.out.print("0]*");
                    System.out.println(ctx.size().getText());
                } else {
                    System.out.print("0.0]*");
                    System.out.println(ctx.size().getText());
                }
            }else{
                System.out.println("]");
            }

        }else{
            /** Declarar variable entera con 0 o variable float con 0.0 */
            //Decidir si hacerla igual a 0 o 0.0
            if (ctx.TYPE().getText().compareTo("integer") == 0) {
                System.out.println("0");
            } else {
                System.out.println("0.0");
            }
        }
    }

    @Override
    public void enterInput(GramaticaCoralParser.InputContext ctx) {
        //Almacenar la variable que se esta asignando actualmente
        currentVariable = ctx.variable().IDENTIFIER().getText();
        /** Declarar variable con input*/
        //Imprimir solo el identificador de la variable
        System.out.print(ctx.variable().IDENTIFIER().getText());
    }

    @Override
    public void exitInput(GramaticaCoralParser.InputContext ctx){
        //Imprimir el input y cerrar parentesis del casteo
        System.out.println("input())");
    }

    @Override
    public void enterSet(GramaticaCoralParser.SetContext ctx) {
        //Almacenar la variable que se esta asignando actualmente
        currentVariable = ctx.variable().IDENTIFIER().getText();

        //Verificar si es una asignación de un size
        if(ctx.variable().RSIZE() != null){
            sizeAssign = true;
        }

        /** Imprimir identificador de la variable*/
        System.out.print(ctx.variable().IDENTIFIER().getText());

    }

    @Override
    public void exitSet(GramaticaCoralParser.SetContext ctx) {
        //Saber si la variable actual es un array
        Boolean arrayVariable = arrayTable.get(ctx.variable().IDENTIFIER().getText());

        //Si la variable NO es un array variable o estamos asignando un size, imprimir parentesis de cast
        if( !(arrayVariable && (ctx.variable().RSIZE() == null)) ){
            //Cerrar el parentesis del cast que se hace en la asignacion
            System.out.println(")");
        } else {
            //Imprimir solo un espacio vacio
            System.out.println();
        }
    }

    @Override
    public void enterOutput(GramaticaCoralParser.OutputContext ctx) {
        /**Imprimir un print( */
        System.out.print("print(");

        //Si es imprimir con cifras decimales especificas
        //Apoyandose en uso de una variable
        if(ctx.with() != null){
            System.out.print("'{:.{_prec}f}'.format(");
        }
    }

    @Override
    public void exitOutput(GramaticaCoralParser.OutputContext ctx) {
        /** Cerrar el parentesis del print */
        //Si es imprimir con cifras decimales especificas
        //Poner un parentesis extra
        if(ctx.with() != null){
            //Cerrar dos parentesis
            System.out.println("), end='')");
        } else {
            System.out.println(", end='')");
        }
    }

    @Override
    public void enterWith(GramaticaCoralParser.WithContext ctx){
        //Imprimir caracteres necesarios para formatear la salida
        System.out.print(", _prec=");
    }

    @Override
    public void enterArithexpr(GramaticaCoralParser.ArithexprContext ctx) {
        /** Verificar si es un number o un variable, que son los casos base */
        if (ctx.number() != null) {
            System.out.print(ctx.number().getText());
        } else if (ctx.variable() != null) {
            //Verificar si es una variable normal o el size de un arreglo
            if(ctx.variable().RSIZE() != null){
                //Usar la longitud de un arreglo
                System.out.print("len(");
                System.out.print(ctx.variable().IDENTIFIER().getText());
                System.out.print(")");
            } else {
                //Si es un acceso a la posicion de un arreglo solo imprimir identificador
                if (ctx.variable().cizq() != null){
                    System.out.print(ctx.variable().IDENTIFIER().getText());
                } else {
                    //Si es una variable que es un solo identificador
                    System.out.print(ctx.variable().getText());
                }
            }
        }
    }

    @Override
    public void enterOutvalue(GramaticaCoralParser.OutvalueContext ctx) {
        if (ctx.STRING() != null) {
            System.out.print(ctx.STRING().getText());
        }
    }

    @Override
    public void enterComment(GramaticaCoralParser.CommentContext ctx) {
        //Comentario sin las barras laterales
        String comentario = ctx.COMMENT().getText().substring(2);
        //Comentario ya tiene salto de linea, por eso sin ln
        System.out.print("#"+comentario);
    }

    @Override
    public void enterSeedrandomnumbers(GramaticaCoralParser.SeedrandomnumbersContext ctx){
        //Imprimir primera parte para asignar la seed
        System.out.print("random.seed(");
    }

    @Override
    public void exitSeedrandomnumbers(GramaticaCoralParser.SeedrandomnumbersContext ctx){
        //Imprimir el parentesis para cerrar el metodo seed
        System.out.println(")");
    }

    @Override
    public void enterCallfunction(GramaticaCoralParser.CallfunctionContext ctx){
        //Verificar si es una funcion SquareRoot
        if (ctx.SQUAREROOT() != null){
            System.out.print("math.sqrt(");
        } else if (ctx.RAISETOPOWER() != null) {
            System.out.print("pow(");
        } else if (ctx.ABSOLUTEVALUE() != null) {
            System.out.print("abs(");
        } else if (ctx.RANDOMNUMBER() != null) {
            System.out.print("random.randint(");
        } else {
            //Esta es una funcion del usuario
            //Imprimir identificador y un parentesis
            System.out.print(ctx.IDENTIFIER().getText());
            System.out.print(ctx.PIZQ().getText());
        }
    }

    @Override
    public void exitCallfunction(GramaticaCoralParser.CallfunctionContext ctx){
        //Verificar si se llama desde un command
        if(ctx.getParent() instanceof GramaticaCoralParser.CommandContext){
            System.out.println(")");
        } else {
            //Cerrar el llamado de la funcion
            System.out.print(")");
        }
    }


    @Override
    public void enterSign(GramaticaCoralParser.SignContext ctx) {
        System.out.print(ctx.SUMOP().getText());
    }

    @Override
    public void enterPizq(GramaticaCoralParser.PizqContext ctx) {
        System.out.print(ctx.PIZQ().getText());
    }

    @Override
    public void enterPder(GramaticaCoralParser.PderContext ctx) {
        System.out.print(ctx.PDER().getText());
    }

    @Override
    public void enterSumop(GramaticaCoralParser.SumopContext ctx) {
        System.out.print(ctx.SUMOP().getText());
    }

    @Override
    public void enterMulop(GramaticaCoralParser.MulopContext ctx) {
        System.out.print(ctx.MULOP().getText());
    }

    @Override
    public void enterCizq(GramaticaCoralParser.CizqContext ctx){
        System.out.print(ctx.CIZQ().getText());
    }

    @Override
    public void enterCder(GramaticaCoralParser.CderContext ctx){
        System.out.print(ctx.CDER().getText());
    }

    @Override
    public void enterComa(GramaticaCoralParser.ComaContext ctx) {
        System.out.print(",");
    }

    @Override
    public void enterNot(GramaticaCoralParser.NotContext ctx){
        System.out.print("not");
    }

    @Override
    public void enterOr(GramaticaCoralParser.OrContext ctx){
        //Se ponen espacios alrededor del or
        System.out.print(" or ");
    }

    @Override
    public void enterAnd(GramaticaCoralParser.AndContext ctx){
        //Se ponen espacios alrededor de and
        System.out.print(" and ");
    }

    @Override
    public void enterOprel(GramaticaCoralParser.OprelContext ctx){
        System.out.print(ctx.OPREL().getText());
    }

    @Override
    public void enterIdentifier(GramaticaCoralParser.IdentifierContext ctx){
        System.out.print(ctx.IDENTIFIER().getText());
    }

    @Override
    public void enterAssign(GramaticaCoralParser.AssignContext ctx){
        // Imprimir un signo igual
        System.out.print(ctx.ASSIGN().getText());

        //Obtener el tipo de la variable a asignar
        String variableType = table.get(currentVariable);

        //Verificar si se esta realizando una asignacion a un size
        if (sizeAssign){
            //Realizar el cast del resultado al tipo de la variable donde se asigna
            if (variableType.compareTo("integer") == 0) {
                System.out.print("[0]*int(");
            } else if (variableType.compareTo("float") == 0) {
                System.out.print("[0.0]*int(");
            }
            sizeAssign = false;
        } else {
            //No es una asignacion de size, pero puede ser una asignacion de array
            //Verificar si es asignacion de array completo o de una variable
            //Obtener un bool que indica si la variable a asignar es un array
            Boolean arrayVariable = arrayTable.get(currentVariable);

            //Si no es variable array hay que castearlo al tipo de la variable
            if(!arrayVariable){
                //Realizar el cast del resultado al tipo de la variable donde se asigna
                if (variableType.compareTo("integer") == 0) {
                    System.out.print("int");
                } else if (variableType.compareTo("float") == 0) {
                    System.out.print("float");
                }
                System.out.print("(");

            }
        }

    }

}

