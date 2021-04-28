package prestamos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private String direccion;

    public estudiante() {
    }

    public estudiante(String codigo, String nombre, String apellido, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean create(String cod, String nom, String ape, String dir) {
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "select * from tbestudiante where estuId ='"+cod+"'";
            Statement statement = enter.createStatement();
            ResultSet result = statement.executeQuery(code);
            if(result.next()){
                JOptionPane.showMessageDialog(null, "El estudiante ya existe");
            } else {
                String code2 = "insert into tbestudiante value(?,?,?,?)";
                PreparedStatement prepared = enter.prepareCall(code2);
                prepared.setString(1, cod);
                prepared.setString(2, nom);
                prepared.setString(3, ape);
                prepared.setString(4, dir);
                resultado = prepared.executeUpdate()>0;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al crear el estudiante\n"+e);
        }
        
        return resultado;
    }
    
    public ResultSet read(){
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        ResultSet result = null;
        
        try{
            String code = "select * from tbestudiante;";
            Statement statement = enter.createStatement();
            result = statement.executeQuery(code);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error en la consulta! "+e);
        }
        return result;
    }
    
    public boolean update(String cod, String nom, String ape, String dir){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "update tbestudiante set estuNom=?, estuApe=?, estuDir=? where estuId=?";
            PreparedStatement prepared = enter.prepareStatement(code);
            prepared.setString(1, nom);
            prepared.setString(2, ape);
            prepared.setString(3, dir);
            prepared.setString(4, cod);
            resultado = prepared.executeUpdate()>0;
            enter.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al actualizar"+e);
        }
        return resultado;
    }
    
    public boolean delete(String cod){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            Statement statement = enter.createStatement();
            String code = "select * from tbestudiante where estuId=' "+cod+" ' ";
            ResultSet result = statement.executeQuery(code);
            if(result.next()){
                String code2 = "delete from tbestudiante where estuId=?";
                PreparedStatement prepared = enter.prepareStatement(code2);
                prepared.setString(1, cod);
                resultado = prepared.executeUpdate()>0;
                JOptionPane.showMessageDialog(null, cod+" se ha eliminado con exito");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "El estudiante no existe");
        }
        
        return resultado;
    }
    
}
