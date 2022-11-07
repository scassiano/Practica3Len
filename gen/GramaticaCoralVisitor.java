// Generated from C:/Users/scass/Desktop/trabajos santiago/Septimo Semestre Unal/Lenguajes de Programacion/Practica/Prueba/grammar\GramaticaCoral.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaCoralParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaCoralVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(GramaticaCoralParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(GramaticaCoralParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(GramaticaCoralParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GramaticaCoralParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(GramaticaCoralParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(GramaticaCoralParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GramaticaCoralParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#forsentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForsentence(GramaticaCoralParser.ForsentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(GramaticaCoralParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GramaticaCoralParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(GramaticaCoralParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(GramaticaCoralParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#setfor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetfor1(GramaticaCoralParser.Setfor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#setfor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetfor2(GramaticaCoralParser.Setfor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(GramaticaCoralParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(GramaticaCoralParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#condexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondexpr(GramaticaCoralParser.CondexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#arithexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithexpr(GramaticaCoralParser.ArithexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#callfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunction(GramaticaCoralParser.CallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GramaticaCoralParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GramaticaCoralParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#argumentsprima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsprima(GramaticaCoralParser.ArgumentsprimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GramaticaCoralParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#parametersprima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersprima(GramaticaCoralParser.ParametersprimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#seedrandomnumbers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeedrandomnumbers(GramaticaCoralParser.SeedrandomnumbersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#outvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutvalue(GramaticaCoralParser.OutvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(GramaticaCoralParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#newlinespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlinespaces(GramaticaCoralParser.NewlinespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#semicolonfor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonfor1(GramaticaCoralParser.Semicolonfor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#semicolonfor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonfor2(GramaticaCoralParser.Semicolonfor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(GramaticaCoralParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(GramaticaCoralParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(GramaticaCoralParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#oprel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprel(GramaticaCoralParser.OprelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith(GramaticaCoralParser.WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(GramaticaCoralParser.ComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GramaticaCoralParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#sumop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumop(GramaticaCoralParser.SumopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(GramaticaCoralParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#cizq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCizq(GramaticaCoralParser.CizqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#cder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCder(GramaticaCoralParser.CderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#pizq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPizq(GramaticaCoralParser.PizqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#pder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPder(GramaticaCoralParser.PderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(GramaticaCoralParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GramaticaCoralParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GramaticaCoralParser.NumberContext ctx);
}