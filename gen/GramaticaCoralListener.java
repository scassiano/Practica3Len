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
}