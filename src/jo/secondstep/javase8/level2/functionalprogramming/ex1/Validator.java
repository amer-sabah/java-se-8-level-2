package jo.secondstep.javase8.level2.functionalprogramming.ex1;

@FunctionalInterface
public interface Validator {

	public boolean isValid(Fact fact);
}
