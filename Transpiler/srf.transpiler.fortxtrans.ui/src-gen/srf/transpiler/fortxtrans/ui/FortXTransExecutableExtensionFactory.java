/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import srf.transpiler.fortxtrans.ui.internal.FortxtransActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FortXTransExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FortxtransActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FortxtransActivator.getInstance().getInjector(FortxtransActivator.SRF_TRANSPILER_FORTXTRANS_FORTXTRANS);
	}
	
}
