/*
 * Archivo: FormProductos_VC_PRODUCTOSS_364448.java
 *
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */

package com.cobiscorp.cobis.fctrc.customevents.impl.form.initdata;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.api.customization.IInitDataEvent;
import com.cobiscorp.designer.api.customization.arguments.IDataEventArgs;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

@Component
@Service({ IInitDataEvent.class })
@Properties({ @Property(name = "task.module", value = "FCTRC"),
             @Property(name = "task.submodule", value = "CLNTS"),
             @Property(name = "task.id", value = "T_FCTRCIMBXAZFA_448"),
             @Property(name = "task.version", value = "1.0.0"),
             @Property(name = "task.controlId", value = "VC_PRODUCTOSS_364448")})

public class FormProductos_VC_PRODUCTOSS_364448 implements IInitDataEvent {
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(FormProductos_VC_PRODUCTOSS_364448.class);

	@Override
	public void executeDataEvent(DynamicRequest arg0, IDataEventArgs arg1) {
		// TODO Auto-generated method stub
		try {
			if (logger.isDebugEnabled()) {
				logger.logDebug("Start executeDataEvent in FormProductos_VC_PRODUCTOSS_364448");
			}
		} catch (Exception ex) {
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}

}

