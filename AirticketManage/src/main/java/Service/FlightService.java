package Service;

import Module.FlightInfor;
import jdbc.Jdbc;

public class FlightService {

    public FlightService updateFlight(FlightInfor flightInfor) {

        String SQL = "UPDATE tb_flightinfo SET flightId = '小ming',mail= '6325@bncom',age='18' WHERE id = '002'";
        Jdbc.executeUpdate(SQL);
      return null;
    }

        public boolean addFlight(FlightInfor flightInfor) {
            String SQL="insert into tb_flightinfo values('"+ flightInfor.getStartPlace()+"','"+flightInfor.getEndPlace() +"',"+ flightInfor.getFlightId() +",'"+flightInfor.getGoDate() +"','"+flightInfor.getGoTime()+"','"+flightInfor.getArriveTime()+"',"+flightInfor.getTicketPrice() +" ,"+flightInfor.getTicketNum()+");";
          //  String SQL = "insert into tb_user values ('"+user.getId()+"','"+user.getPassid()+"','"+user.getName()+"','"+user.getMail()+"',"+user.getAge()+",'地球人') ";
          //  insert into tb_flightinfo values('哈尔滨','云南',246758,'2017-9-9','13:00','19:00',500,88);
            return Jdbc.executInsert(SQL);
        }

    public boolean deleteFlight(int flightId){
        String SQL="DELETE FROM tb_flightinfo WHERE flightId ='"+flightId+"'";
        return Jdbc.execuDelete(SQL);
    }

}
