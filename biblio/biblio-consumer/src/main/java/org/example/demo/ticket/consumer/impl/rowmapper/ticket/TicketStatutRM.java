package org.example.demo.ticket.consumer.impl.rowmapper.ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;


public class TicketStatutRM implements RowMapper<TicketStatut> {
    @Override
    public TicketStatut mapRow(ResultSet rs, int rowNum) throws SQLException {
        TicketStatut vTicketStatut = new TicketStatut(rs.getInt("id"));
        vTicketStatut.setLibelle(rs.getString("libelle"));
        return  vTicketStatut;
    }
}
