// Generated from C:/Users/scass/Desktop/trabajos santiago/Septimo Semestre Unal/Lenguajes de Programacion/Practica/Prueba/grammar\GramaticaCoral.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaCoralParser}.
 */
public interface GramaticaCoralListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticaCoralParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticaCoralParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(GramaticaCoralParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(GramaticaCoralParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GramaticaCoralParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GramaticaCoralParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramaticaCoralParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramaticaCoralParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(GramaticaCoralParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(GramaticaCoralParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(GramaticaCoralParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(GramaticaCoralParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(GramaticaCoralParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(GramaticaCoralParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(GramaticaCoralParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(GramaticaCoralParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#arithexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithexpr(GramaticaCoralParser.ArithexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#arithexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithexpr(GramaticaCoralParser.ArithexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GramaticaCoralParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GramaticaCoralParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#seedrandomnumbers}.
	 * @param ctx the parse tree
	 */
	void enterSeedrandomnumbers(GramaticaCoralParser.SeedrandomnumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#seedrandomnumbers}.
	 * @param ctx the parse tree
	 */
	void exitSeedrandomnumbers(GramaticaCoralParser.SeedrandomnumbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#outvalue}.
	 * @param ctx the parse tree
	 */
	void enterOutvalue(GramaticaCoralParser.OutvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#outvalue}.
	 * @param ctx the parse tree
	 */
	void exitOutvalue(GramaticaCoralParser.OutvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(GramaticaCoralParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(GramaticaCoralParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GramaticaCoralParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GramaticaCoralParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#sumop}.
	 * @param ctx the parse tree
	 */
	void enterSumop(GramaticaCoralParser.SumopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#sumop}.
	 * @param ctx the parse tree
	 */
	void exitSumop(GramaticaCoralParser.SumopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(GramaticaCoralParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(GramaticaCoralParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#cizq}.
	 * @param ctx the parse tree
	 */
	void enterCizq(GramaticaCoralParser.CizqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#cizq}.
	 * @param ctx the parse tree
	 */
	void exitCizq(GramaticaCoralParser.CizqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#cder}.
	 * @param ctx the parse tree
	 */
	void enterCder(GramaticaCoralParser.CderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#cder}.
	 * @param ctx the parse tree
	 */
	void exitCder(GramaticaCoralParser.CderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#pizq}.
	 * @param ctx the parse tree
	 */
	void enterPizq(GramaticaCoralParser.PizqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#pizq}.
	 * @param ctx the parse tree
	 */
	void exitPizq(GramaticaCoralParser.PizqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#pder}.
	 * @param ctx the parse tree
	 */
	void enterPder(GramaticaCoralParser.PderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#pder}.
	 * @param ctx the parse tree
	 */
	void exitPder(GramaticaCoralParser.PderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(GramaticaCoralParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(GramaticaCoralParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCoralParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GramaticaCoralParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCoralParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GramaticaCoralParser.NumberContext ctx);
}