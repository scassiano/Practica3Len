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
}