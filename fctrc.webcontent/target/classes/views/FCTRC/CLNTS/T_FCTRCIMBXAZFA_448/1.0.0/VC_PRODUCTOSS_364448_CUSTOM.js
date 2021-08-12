/* variables locales de T_FCTRCIMBXAZFA_448*/

(function (root, factory) {
    factory();
} (this, function() {

    "use strict";

    /*global designerEvents, console */

        //*********** COMENTARIOS DE AYUDA **************
        //  Para imprimir mensajes en consola
        //  console.log("executeCommand");

        //  Para enviar mensaje use
        //  eventArgs.commons.messageHandler.showMessagesInformation('Ejecutando comando personalizado');

        //  Para evitar que se continue con la validación a nivel de servidor
        //  eventArgs.commons.execServer = false;

        //**********************************************************
        //  Eventos de VISUAL ATTRIBUTES
        //**********************************************************

    
        var task = designerEvents.api.formproductos;
    

    //"TaskId": "T_FCTRCIMBXAZFA_448"


    	
//ProductoQuery Entity: Producto
task.executeQuery.Q_PRODCOOU_UG38 = function(executeQueryEventArgs){
    executeQueryEventArgs.commons.execServer = true;
    //executeQueryEventArgs.commons.serverParameters.Producto = true;
};

	
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: FormProductos
task.initData.VC_PRODUCTOSS_364448 = function (entities, initDataEventArgs){

    initDataEventArgs.commons.execServer = true;
    //initDataEventArgs.commons.serverParameters.entityName = true;

};

	
    
//Evento onCloseModalEvent : Evento que actua como listener cuando se cierra ventanas modales.
//ViewContainer: FormProductos
task.onCloseModalEvent = function (entities, onCloseModalEventArgs){
    
    
    if(onCloseModalEventArgs.closedViewContainerID!=''){
        onCloseModalEventArgs.commons.api.grid.refresh('QV_QS38_YVG93');
    }
    console.log(onCloseModalEventArgs);
    
    onCloseModalEventArgs.commons.execServer = false;

};

	
//gridRowDeleting QueryView: QV_QS38_YVG93
//Se ejecuta antes de que los datos eliminados en una grilla sean comprometidos.
task.gridRowDeleting.QV_QS38_YVG93 = function (entities,gridRowDeletingEventArgs) {
    
    entities.Producto.operacion = 'E'
     gridRowDeletingEventArgs.commons.execServer = true;
     //gridRowDeletingEventArgs.commons.serverParameters.Producto = true;

};








}));
