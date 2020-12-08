
package seguroautomotor;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class SeguroAutomotor {

    
    public static void main(String[] args) {
        
        
        /*2)solicitar datos del cliente */
        String name = JOptionPane.showInputDialog("Ingresar su nombre");
        String apellido = JOptionPane.showInputDialog("Ingresar apellido");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de telefono"));
        String email = JOptionPane.showInputDialog("Ingresar email");
        int valorcuota=0;
        
        /*3)datos del vehiculo */
	String[] marca = { "Renault", "Ford", "Fiat", "Peugeot",};
      final JComboBox<String> combo = new JComboBox<>(marca);
      
      String modelo = JOptionPane.showInputDialog("Ingrese modelo de auto");
      String dominio = JOptionPane.showInputDialog("Ingrese dominio");
      int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antiguedad de auto"));
      
      if (año < 5) {
    
    System.out.println("pagara un extra de $ 500");
} else if (año > 5 && año<10) {
    
    System.out.println("pagara un extra de $1000");
} else if (año >= 10 && año <15) {
    System.out.println("pagara un extra de $1500");
} 
else if (año > 15 && año <20) {
    System.out.println("pagara un extra de $2000");
} else if (año>20) {
    
    JOptionPane.showMessageDialog(null, "no se asegura vehiculo con antuguedad mayor a 20 años");
}
      
      /*4)tipo de cobertura */
      Object cobertura = JOptionPane.showInputDialog(null,"Seleccione tipo de cobertura",
     "cobertura", JOptionPane.QUESTION_MESSAGE, null,
      new Object[] { "Seleccione","Terceros completos", "Todo riesgo", "Responsabilidad civil" },"Seleccione");
      int rc=1000;
      int tc=2000;
      int tr=3000;
      int adicional=0;
      int opcion=0;
      
      do {
                       switch(opcion){
                           case 1:
                               rc=1000;
                               break;
                           case 2:
                               tc=2000;
                               break;
                           case 3:
                                tr=3000;
                               break;
        
                              }
    
       }while(opcion>3);
      
      
        /*5)Adicionales de la cobertura */
      String[] arreglo={"Granizo","Llantas deportivas","Asistencia mecánica","Localizador gps"};
      int seleccion = JOptionPane.showOptionDialog(null,"seleccione cobertura adicional","elige...",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                        arreglo,"" );
      
              valorcuota=cobertura+adicional+año;
         
         /*6)Impresión de póliza (opcional función)*/
         public static void datosUsuario(String nombre,String apellido,int telefono){
            System.out.println("=================================\n"
                               +"========== seguro automotor =========\n"
                               +"================================");
            System.out.println("Cliente: " + nombre +apellido+ "\ntelefono: " + telefono );
            System.out.println("Cliente: " + nombre +apellido+ "\ntelefono: " + telefono );           
            System.out.println("Cliente: " + nombre +apellido+ "\ntelefono: " + telefono );           
}
}
