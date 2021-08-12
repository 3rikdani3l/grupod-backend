/* variables locales de T_FCTRCOESSONMH_633*/

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

    
        var task = designerEvents.api.formproducto;
    

    //"TaskId": "T_FCTRCOESSONMH_633"


    	

//Entity: Producto
//Producto. (Button) View: FormProducto
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONAUHIJSF_103883 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = true;
    //executeCommandEventArgs.commons.serverParameters.Producto = true;

};

	
//Start signature to Callback event to VA_VABUTTONAUHIJSF_103883
task.executeCommandCallback.VA_VABUTTONAUHIJSF_103883 = function(entities, executeCommandCallbackEventArgs) {
    let nav = executeCommandCallbackEventArgs.commons.api.navigation; 
    nav.closeModal({});
};


	
     
//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: FormProducto
task.initData.VC_PRODUCTOII_788633 = function (entities, initDataEventArgs){

    console.log(entities)
    if(entities.Producto.codigo =='' || entities.Producto.codigo == null){
        entities.Producto.operacion = 'I'
        
    }else{
        entities.Producto.operacion = 'U'
        initDataEventArgs.commons.api.viewState.disable('VA_CODIGODGYZTMTQX_515883');
    }
    initDataEventArgs.commons.execServer = false;

};



}));
