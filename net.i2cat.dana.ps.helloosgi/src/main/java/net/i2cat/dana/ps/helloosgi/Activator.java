package net.i2cat.dana.ps.helloosgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

public class Activator implements BundleActivator {

	private LogService	log;

	public void start(BundleContext context) throws Exception {
		ServiceReference ref = context.getServiceReference(LogService.class.getName());
		if (ref != null)
		{
			log = (LogService) context.getService(ref);
		}
		log.log(LogService.LOG_INFO, "Hello OSGi!!");
	}

	public void stop(BundleContext context) throws Exception {
		log.log(LogService.LOG_INFO, "Goodbye OSGi!!");
	}

}
