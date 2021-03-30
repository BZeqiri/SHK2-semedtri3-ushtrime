public class Mesimdhenesi {

	private String emri;
	private int vitiLindjes;
	private String angazhimi;

	public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi) {
		this.emri = emri;
		this.vitiLindjes = vitiLindjes;
		this.angazhimi = angazhimi;
	}

	public int getVitiLindjes() {
		return vitiLindjes;
	}

	public void setVitiLindjes(int vitiLindjes) {
		this.vitiLindjes = vitiLindjes;
	}

	public String getAngazhimi() {
		return angazhimi;
	}

	public void setAngazhimi(String angazhimi) {
		this.angazhimi = angazhimi;
	}

	public String getEmri() {
		return emri;
	}

	@Override
	public String toString() {
		return emri + " : " + vitiLindjes + " mban " + angazhimi;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mesimdhenesi) {
			Mesimdhenesi m = (Mesimdhenesi) obj;
			return emri.equals(m.getEmri()) && vitiLindjes == m.getVitiLindjes();
		}
		return false;
	}
}

