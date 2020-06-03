package fr.tblf.gemoc.extension.calculus;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;

import fr.tblf.energy.estimation.eel.ExponentialMeasure;
import fr.tblf.energy.estimation.eel.IntegrationMeasure;
import fr.tblf.energy.estimation.eel.LogisticMeasure;

public class CompositeMeasureCalculus {
	
	public static double computeLogisticFunction(LogisticMeasure m) {		
		return computeLogisticFunction(m.getL().value()	.doubleValue(), m.getK().value().doubleValue(), m.getX0().value().doubleValue(), m.getX().value().doubleValue());
	}
	
	public static double computeLogisticFunction(double L, double k, double x0, double x) {
		double expValue = Math.exp((x - x0)* (-1) * k);
		return L / (1+expValue);		
	}
	
	public static double computeExponentialFunction(ExponentialMeasure m) {
		return Math.exp(m.getX().value().doubleValue());
	}
	
	public static double computeIntegralFunction(IntegrationMeasure m) {
		UnivariateFunction fun = generateFunctionForIntegration(m);
		UnivariateIntegrator in = new SimpsonIntegrator();
		
		return in.integrate(20000, fun, m.getLeftBound().doubleValue(), m.getRightBound().doubleValue());		
	}
	
	private static UnivariateFunction generateFunctionForIntegration(IntegrationMeasure m) {
		if (m.getFunction() instanceof LogisticMeasure) {
			LogisticMeasure lm = (LogisticMeasure) m.getFunction();
			return new UnivariateFunction() {				
				@Override
				public double value(double x) {					
					return computeLogisticFunction(lm.getL().value().doubleValue(), lm.getK().value().doubleValue(), lm.getX0().value().doubleValue(), x);
				}
			};
		}
		if (m.getFunction() instanceof ExponentialMeasure) {
			ExponentialMeasure lm = (ExponentialMeasure) m.getFunction();
			return new UnivariateFunction() {				
				@Override
				public double value(double x) {					
					return Math.exp(x);
				}
			};
		}
		
		return new UnivariateFunction() {
			
			@Override
			public double value(double arg0) {
				return 0;
			}
		};
	}
}

