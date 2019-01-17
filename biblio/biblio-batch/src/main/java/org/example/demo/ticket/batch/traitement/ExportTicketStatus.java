package org.example.demo.ticket.batch.traitement;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.inject.Named;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.TechnicalException;


@Named
public class ExportTicketStatus extends AbstractTraitement {

    /** Logger pour la classe */
    private static final Log LOGGER = LogFactory.getLog(ExportTicketStatus.class);

    public void run() throws TechnicalException {
        String vFilename
            = "statuts_" + DateFormatUtils.format(new Date(), "yyyy-MM-dd_HH-mm-ss-SSS") + ".txt";
        File vExportFile = new File(getExportPath(), vFilename);

        try (FileWriter vFileWriter = new FileWriter(vExportFile, false)) {
            List<TicketStatut> vStatuts = getManagerFactory().getTicketManager().getListTicketStatut();
            for (TicketStatut vStatut : vStatuts) {
                vFileWriter.write(vStatut.toString());
                vFileWriter.write("\n");
            }
            vFileWriter.flush();
        } catch (IOException vEx) {
            throw new TechnicalException("Erreur d'exportation", vEx);
        }

        LOGGER.info("Fichier exporté : " + vExportFile.getAbsolutePath());
    }
}
