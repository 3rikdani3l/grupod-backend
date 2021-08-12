/*
 * Archivo: QV_QS38_YVG93_QueryViewEvent.java
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

package com.cobiscorp.cobis.fctrc.customevents.queryview;

import java.util.List;

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
import com.cobiscorp.designer.api.DataEntityList;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.api.builder.QueryViewEventBuilder;
import com.cobiscorp.designer.api.customization.*;
import com.cobiscorp.designer.api.customization.arguments.*;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

/**
 * Personalizacion de Eventos del Query
 *
 * QV_QS38_YVG93_QueryViewEvent - FormProductos
 *
 */
@Component
@Service({ QueryViewEventBuilder.class })
@Properties({ @Property(name = "queryView.id", value = "QV_QS38_YVG93") })

public class CEQV_204QV_QS38_YVG93_933_QueryViewEvent extends QueryViewEventBuilder
 implements IGridRowDeleting
{
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(CEQV_204QV_QS38_YVG93_933_QueryViewEvent.class);
    
	@Reference(name="iGridRowDeletingQV_QS38_YVG93",referenceInterface =IGridRowDeleting.class,bind = "setiGridRowDeletingQV_QS38_YVG93",unbind = "unsetiGridRowDeletingQV_QS38_YVG93",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(queryView.id=QV_QS38_YVG93)(queryView.controlId=QV_QS38_YVG93))")
	private IGridRowDeleting iGridRowDeletingQV_QS38_YVG93;

	public void setiGridRowDeletingQV_QS38_YVG93(IGridRowDeleting iGridRowDeletingQV_QS38_YVG93) {
		this.iGridRowDeletingQV_QS38_YVG93 = iGridRowDeletingQV_QS38_YVG93;
	}

	public void unsetiGridRowDeletingQV_QS38_YVG93(IGridRowDeleting iGridRowDeletingQV_QS38_YVG93) {
		this.iGridRowDeletingQV_QS38_YVG93 = iGridRowDeletingQV_QS38_YVG93;
	}

	@Reference(bind = "setBLI1148_bli_delete_producto", unbind = "unsetBLI1148_bli_delete_producto", cardinality = ReferenceCardinality.MANDATORY_UNARY,target="(bli.id=BLI1148_bli_delete_producto)")
	private com.cobiscorp.designer.bli.api.IBLIExecutor bLI1148_bli_delete_producto;
	public void setBLI1148_bli_delete_producto(com.cobiscorp.designer.bli.api.IBLIExecutor bLI1148_bli_delete_producto) {
		this.bLI1148_bli_delete_producto = bLI1148_bli_delete_producto;
	}
	public void unsetBLI1148_bli_delete_producto(com.cobiscorp.designer.bli.api.IBLIExecutor bLI1148_bli_delete_producto) {
		this.bLI1148_bli_delete_producto = null;
	}
	@Override
	public void rowAction(DataEntity arg0, IGridRowActionEventArgs arg1) {
		try {
			iGridRowDeletingQV_QS38_YVG93.rowAction(arg0, arg1);
			bLI1148_bli_delete_producto.execute(arg1.getDynamicRequest());
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}


	@Override
	public void configure() {
        this.addGridRowDeleting("QV_QS38_YVG93", this);
	}
}

