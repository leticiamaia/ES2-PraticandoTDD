import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Filtro {

	public List filtrar(List<Fatura> faturas) {
		for(int i = faturas.size()-1; i >= 0; i--) {
			Fatura fatura = faturas.get(i);
			if(fatura.getValor() < 2000) {
				faturas.remove(i);
			} else if(fatura.getValor() >= 2000 && fatura.getValor() <= 2500 
					&& (isMonthBefore(fatura.getData(), new Date(), 1))) {
				faturas.remove(i);
			} else if(fatura.getValor() >= 2500 && fatura.getValor() <= 3000 
					&& (isMonthBefore(fatura.getData(), new Date(), 3))) {
				faturas.remove(i);
			} else if(fatura.getValor() >= 4000 &&
					(fatura.getCliente().getEstado().getRegion().equals("S"))) {
				faturas.remove(i);
			}
		}
		return faturas;
	}
	
	private boolean isMonthBefore(Date date1, Date date2, int numberOfMonths) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(date1);
		cal2.setTime(date2);
		cal2.add(Calendar.MONTH, -numberOfMonths);
		
		if(cal1.before(cal2)) {
			return true;
		}
		return false;
	}
}
