package iso2ControlManager.sql;

import iso2ControlManager.sql.entity.Configuration;
import iso2ControlManager.sql.entity.Pc;

/**
 * Author: Starikov Vyacheslav
 * Department: 8011
 * Date: 23.01.19 16:08
 */
public interface SQL {




    void init();
    boolean isConnect();
    void connect();
    void disconect();
    Pc getPc(String ip);
    Configuration getConfiguration();
    Configuration getConfigurationByPc(int id);
    Configuration updateConfiguration(Configuration configuration);

}
