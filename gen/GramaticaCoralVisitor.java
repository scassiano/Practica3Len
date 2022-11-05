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
	 * Visit a parse tree produced by {@link GramaticaCoralParser#arithexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithexpr(GramaticaCoralParser.ArithexprContext ctx);
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
	 * Visit a parse tree produced by {@link GramaticaCoralParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GramaticaCoralParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCoralParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GramaticaCoralParser.VariableContext ctx);
}