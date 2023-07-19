//
//import org.apache.commons.math3.optim.*;
//import org.apache.commons.math3.optim.linear.*;
//import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
//import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
//import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction.*;
////import org.apache.commons.math3.optim.nonlinear.scalar.constraint.*;
//
//public class test {
//
//    public static void main(String[] args) {
//
//        // Define the objective function (2x + 3y).
//        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[] { 2, 3 }, 0);
//
//        // Define the constraints (x + y <= 5, 2x + y <= 8).
//        LinearConstraintSet constraints = new LinearConstraintSet(
//                new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5),
//                new LinearConstraint(new double[] { 2, 1 }, Relationship.LEQ, 8)
//        );
//
//        // Define the optimization problem.
//        OptimizationProblem problem = new LinearOptimizationProblem(
//                objective,
//                constraints,
//                GoalType.MAXIMIZE
//        );
//
//        // Solve the problem.
//        SimplexSolver solver = new SimplexSolver();
//        PointValuePair solution = solver.optimize(problem);
//
//        //Print the solution.
//        System.out.println("Solution: " + solution.getPoint());
//    }
//}
