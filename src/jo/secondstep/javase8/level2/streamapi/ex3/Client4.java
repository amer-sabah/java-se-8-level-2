package jo.secondstep.javase8.level2.streamapi.ex3;

import java.util.function.BooleanSupplier;

public class Client4 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Learning the Functional Interfaces for Primitives
		// Functional Interfaces for boolean
		// Functional Interfaces for double, int, and long
		//
		//
		// Common functional interfaces for primitives
		// +-----------------------------------------------------------------------------------+
		// | Functional Interfaces | # Parameters       | Return Type | Single Abstract Method |
		// +-----------------------------------------------------------------------------------+
		// | DoubleSupplier        | 0                  | double      | getAsDouble            |       
		// +-----------------------------------------------------------------------------------+
		// | IntSupplier           | 0                  | int         | getAsInt               |       
		// +-----------------------------------------------------------------------------------+
		// | LongSupplier          | 0                  | long        | getAsLong              |       
		// +-----------------------------------------------------------------------------------+
		// | DoubleConsumer        | 1 (double)         | void        | accept                 |       
		// +-----------------------------------------------------------------------------------+
		// | IntConsumer           | 1 (int)            | void        | accept                 |       
		// +-----------------------------------------------------------------------------------+
		// | LongConsumer          | 1 (long)           | void        | accept                 |       
		// +-----------------------------------------------------------------------------------+
		// | DoublePredicate       | 1 (double)         | boolean     | test                   |       
		// +-----------------------------------------------------------------------------------+
		// | IntPredicate          | 1 (int)            | boolean     | test                   |       
		// +-----------------------------------------------------------------------------------+
		// | LongPredicate         | 1 (long)           | boolean     | test                   |       
		// +-----------------------------------------------------------------------------------+
		// | DoubleFunction<R>     | 1 (double)         | R           | apply                  |       
		// +-----------------------------------------------------------------------------------+
		// | IntFunction<R>        | 1 (int)            | R           | apply                  |       
		// +-----------------------------------------------------------------------------------+
		// | LongFunction<R>       | 1 (long)           | R           | apply                  |       
		// +-----------------------------------------------------------------------------------+
		// | DoubleUnaryOperator   | 1 (double)         | double      | applyAsDouble          |       
		// +-----------------------------------------------------------------------------------+
		// | IntUnaryOperator      | 1 (int)            | int         | applyAsInt             |       
		// +-----------------------------------------------------------------------------------+
		// | LongUnaryOperator     | 1 (long)           | long        | applyAsLong            |       
		// +-----------------------------------------------------------------------------------+
		// | DoubleBinaryOperator  | 2 (double, double) | double      | applyAsDouble          |       
		// +-----------------------------------------------------------------------------------+
		// | IntBinaryOperator     | 2 (int, int)       | int         | applyAsInt             |       
		// +-----------------------------------------------------------------------------------+
		// | LongBinaryOperator    | 2 (long, long)     | long        | applyAsLong            |       
		// +-----------------------------------------------------------------------------------+
		//
		//
		// Primitive-specific functional interfaces
		// +---------------------------------------------------------------------------------+
		// | Functional Interfaces    | # Parameters  | Return Type | Single Abstract Method |
		// +---------------------------------------------------------------------------------+
		// | ToDoubleFunction<T>      | 1(T)          | double      | applyAsDouble          |       
		// +---------------------------------------------------------------------------------+
		// | ToIntFunction<T>         | 1(T)          | int         | applyAsInt             |       
		// +---------------------------------------------------------------------------------+
		// | ToLongFunction<T>        | 1(T)          | long        | applyAsLong            |       
		// +---------------------------------------------------------------------------------+
		// | ToDoubleBiFunction<T, U> | 2 (T, U)      | double      | applyAsDouble          |       
		// +---------------------------------------------------------------------------------+
		// | ToIntBiFunction<T, U>    | 2 (T, U)      | int         | applyAsInt             |       
		// +---------------------------------------------------------------------------------+
		// | ToLongBiFunction<T, U>   | 2 (T, U)      | long        | applyAsLong            |       
		// +---------------------------------------------------------------------------------+
		// | DoubleToIntFunction      | 1 (double)    | int         | applyAsInt             |       
		// +---------------------------------------------------------------------------------+
		// | DoubleToLongFunction     | 1 (double)    | long        | applyAsLong            |       
		// +---------------------------------------------------------------------------------+
		// | IntToDoubleFunction      | 1 (int)       | double      | applyAsDouble          |       
		// +---------------------------------------------------------------------------------+
		// | IntToLongFunction        | 1 (int)       | long        | applyAsLong            |       
		// +---------------------------------------------------------------------------------+
		// | LongToDoubleFunction     | 1 (long)      | double      | applyAsDouble          |       
		// +---------------------------------------------------------------------------------+
		// | LongToIntFunction        | 1 (long)      | int         | applyAsInt             |       
		// +---------------------------------------------------------------------------------+
		// | ObjDoubleConsumer<T>     | 2 (T, double) | void        | accept                 |       
		// +---------------------------------------------------------------------------------+
		// | ObjIntConsumer<T>        | 2 (T, int)    | void        | accept                 |       
		// +---------------------------------------------------------------------------------+
		// | ObjLongConsumer<T>       | 2 (T, long)   | void        | accept                 |       
		// +---------------------------------------------------------------------------------+


		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());
	 
	}
}
