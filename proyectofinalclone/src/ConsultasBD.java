/*
 * To change this license header, choose License Headedatosusuario in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.ResultSet;
import java.util.ArrayList;


public class ConsultasBD {
    MySqlBD baseDatos = new MySqlBD().conectar("localhost", "traductor", "root", "1234");
    public ArrayList<Mensaje> obtenerMsgAdmin(){
        ArrayList<Mensaje> msg=new ArrayList<>();
        ResultSet datosusuario = baseDatos.consultar("select m.id_mensaje,m.id_usuario,m.asunto,m.mensaje,m.tipo,u.nombre,u.apellido,u.alias,u.contrasena,u.alias from mensajes as m inner join usuarios as u where m.id_usuario=u.id_usuario;");
        if (datosusuario != null) {
            try {
                while (datosusuario.next()) {
                    
                   msg.add(new Mensaje(datosusuario.getInt("id_mensaje"),new Usuario(datosusuario.getInt("id_usuario"), datosusuario.getString("nombre"),  datosusuario.getString("apellido"),  datosusuario.getString("alias"),  datosusuario.getString("contrasena"),  
                           datosusuario.getString("tipo")),datosusuario.getString("asunto"),datosusuario.getString("mensaje"),datosusuario.getString("tipo")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    return msg;
    }
    public ArrayList<Usuario> consultarUsuarios() {
    ArrayList<Usuario> usuario = new ArrayList<>();
        ResultSet datosusuario = baseDatos.consultar("SELECT * FROM usuarios");
        if (datosusuario != null) {
            try {
                while (datosusuario.next()) {
                    
                   usuario.add(new Usuario(datosusuario.getInt("id_usuario"),
                            datosusuario.getString("nombre")
                           , datosusuario.getString("apellido"), datosusuario.getString("alias"),
                             datosusuario.getString("contrasena"),datosusuario.getString("tipo")));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return usuario;
    }
    
    public boolean insertaMensaje(String sql){
        boolean datosusuario = baseDatos.ejecutar(sql);
        return datosusuario;
    }
 }
