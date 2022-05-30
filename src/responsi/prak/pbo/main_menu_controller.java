/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.prak.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Suyoto
 */
public class main_menu_controller {
    view_main_menu viewmainmenu;

    public main_menu_controller(view_main_menu vmm) {
        this.viewmainmenu = vmm;
        
        viewmainmenu.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                model_barang modelbarang = new model_barang();
                view_input_barang inputbarang= new view_input_barang();
                viewmainmenu.setVisible(false);
                input_barang_controller inputbarangcontroller=new input_barang_controller(inputbarang,modelbarang);
            }
        });
        
        viewmainmenu.btnLihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                model_barang model_barang = new model_barang();
                view_lihat_barang lihatbarang= new view_lihat_barang();
                viewmainmenu.setVisible(false);
                lihat_barang_controller lihatbarangController=new lihat_barang_controller(lihatbarang,model_barang);
            }
        });
    }
    
    
    
}