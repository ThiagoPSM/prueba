class producto{

private String fechaVencimiento;
private int numeroLote;
private String fechaEnvasado;


public String getfechaVencimiento(){
    return fechaVencimiento;
}
public int getNumeroLote(){
    return numeroLote;
}
public String getfechaEnvasado(){
    return fechaVencimiento;
}

producto(){
    fechaEnvasado=" ";
    numeroLote=0;
    fechaVencimiento=" ";
}
producto(producto objeto){
    fechaEnvasado=objeto.getfechaVencimiento();
    numeroLote=objeto.getNumeroLote();
    fechaVencimiento=objeto.getfechaVencimiento();

}
producto(String envasado, int lote, String vencimiento){
    this.fechaEnvasado=envasado;
    this.numeroLote=lote;
    this.fechaVencimiento=vencimiento;
}

class productoFresco extends producto{
}

class productoRefrigerado extends producto{
  private int codigoOrganismo;
  private String temperatura;

  public int getCodigoOrganismo(){
      return codigoOrganismo;
  }
  public String getTemperatura(){
      return temperatura;
  }

  productoRefrigerado(productoRefrigerado objeto){
      super(objeto);
      codigoOrganismo=objeto.getCodigoOrganismo();
      temperatura=objeto.getTemperatura();
  }
}

class productoCongelados extends producto{
  private String temperatura;

  public String getTemperatura(){
      return temperatura;
  }

  productoCongelados(productoCongelados objeto){
      super(objeto);
      temperatura=getTemperatura();
  }
}

class congeladosPorAire extends productoCongelados{
  private String informacionComposicion;

  public String getInformacionComposicion(){
      return informacionComposicion;
  }

  congeladosPorAire(congeladosPorAire objeto){
      super(objeto);
      informacionComposicion=objeto.getInformacionComposicion();
  }



  
}
class congeladosPorAgua extends productoCongelados{
  private double salinidad;

  public double getSalinidad(){
      return salinidad;
  }

  congeladosPorAgua(congeladosPorAgua objeto){
      super(objeto);
      salinidad=objeto.getSalinidad();
  }




}
class congeladosPorNitrogeno extends productoCongelados{ 
  private String metodoComposicion;
  private int tiempoExposicion;

   public String getMetodoComposicion(){
      return metodoComposicion;
  }
   public int getiempoExposicion(){
      return tiempoExposicion;
  }

  congeladosPorNitrogeno(congeladosPorNitrogeno objeto){
      super(objeto);
      metodoComposicion=objeto.getMetodoComposicion();
      tiempoExposicion=objeto.getiempoExposicion();
  }
}}


