package com.contact.manager.dao;

import java.sql.*;
import java.util.*;
import com.contact.manager.model.Contact;
import com.contact.manager.util.ConnectionHelper;

public class ContactDaoImpl implements ContactDao {
    Connection conn;

    @Override
    public void addContact(Contact c) {
        try {
        	conn  = ConnectionHelper.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO contacts(name,email,phone) VALUES(?,?,?)");
            ps.setString(1, c.getName());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getPhone());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> list = new ArrayList<>();
        try {
        	conn  = ConnectionHelper.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM contacts");
            while (rs.next()) {
                list.add(new Contact(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("phone")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Contact getContactById(int id) {
        Contact c = null;
        try {
        	conn  = ConnectionHelper.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM contacts WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = new Contact(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public void updateContact(Contact c) {
        try {
        	conn  = ConnectionHelper.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE contacts SET name=?, email=?, phone=? WHERE id=?");
            ps.setString(1, c.getName());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getPhone());
            ps.setInt(4, c.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteContact(int id) {
        try {
        	conn  = ConnectionHelper.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM contacts WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
