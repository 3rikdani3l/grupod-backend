/*
 * Archivo: T_FCTRCIMBXAZFA_448_FormEvent.java
 * Fecha: 12/08/2021 03:40:56 AM
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

package com.cobiscorp.cobis.fctrc.customevents.form;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.apache.felix.scr.annotations.Service;

import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.designer.api.DataEntity;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.api.builder.FormEventBuilder;
import com.cobiscorp.designer.api.customization.*;
import com.cobiscorp.designer.api.customization.arguments.*;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

/**
 * Personalizacion de Eventos del Formulario
 *
 * T_FCTRCIMBXAZFA_448_FormEvent - FormProductos
 *
 */
@Component
@Service({ FormEventBuilder.class })
@Properties({ @Property(name = "task.module", value = "FCTRC"),
             @Property(name = "task.submodule", value = "CLNTS"),
             @Property(name = "task.id", value = "T_FCTRCIMBXAZFA_448"),
             @Property(name = "task.version", value = "1.0.0"),
             @Property(name = "eventId", value = "CEVC_002T_FCTRCIMBXAZFA_448_227") })
public class T_FCTRCIMBXAZFA_448_FormEventCEVC_002T_FCTRCIMBXAZFA_448_227 extends FormEventBuilder
 implements IInitDataEvent
{
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(T_FCTRCIMBXAZFA_448_FormEventCEVC_002T_FCTRCIMBXAZFA_448_227.class);
    
	@Reference(name="iInitDataEventVC_PRODUCTOSS_364448",referenceInterface =IInitDataEvent.class,bind = "setiInitDataEventVC_PRODUCTOSS_364448",unbind = "unsetiInitDataEventVC_PRODUCTOSS_364448",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(task.module=FCTRC)(task.submodule=CLNTS)(task.id=T_FCTRCIMBXAZFA_448)(task.version=1.0.0)(task.controlId=VC_PRODUCTOSS_364448))")
	private IInitDataEvent iInitDataEventVC_PRODUCTOSS_364448;

	public void setiInitDataEventVC_PRODUCTOSS_364448(IInitDataEvent iInitDataEventVC_PRODUCTOSS_364448) {
		this.iInitDataEventVC_PRODUCTOSS_364448 = iInitDataEventVC_PRODUCTOSS_364448;
	}

	public void unsetiInitDataEventVC_PRODUCTOSS_364448(IInitDataEvent iInitDataEventVC_PRODUCTOSS_364448) {
		this.iInitDataEventVC_PRODUCTOSS_364448 = iInitDataEventVC_PRODUCTOSS_364448;
	}

         	@Override
	public void executeDataEvent(DynamicRequest arg0, IDataEventArgs arg1) {
		try {
			iInitDataEventVC_PRODUCTOSS_364448.executeDataEvent(arg0, arg1);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}


	@Override
	public void configure() {
         this.addInitDataEvent("VC_PRODUCTOSS_364448", this);
	}

}

