import groovy.sql.Sql

/**
 * groovy访问Excel表格
 *
 * Created by lizihanglove on 2017/5/26.
 */

def sql = Sql.newInstance(
"""jdbc.odbc.Driver = {Microsoft Excel Driver (*.xls,*.xlsx,*.xlsm,*.xlsb)};
                    DBQ = ../temperature.xls;
                READONLY = false""",'','')
println "../temperature.xls"
sql.eachRow('SELECT * from [temperature$]'){
    println "${it.city} : ${it.temperature}"
}