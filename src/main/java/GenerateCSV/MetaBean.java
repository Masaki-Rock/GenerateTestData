package GenerateCSV;

public class MetaBean {

	private String label;
	
	private String type;
	
	private int length;

	public MetaBean(String item) {
		String[] ilist = item.split("	");
		this.label = ilist[0];
		if (ilist.length < 2) return;
		this.type = ilist[1];
		if (ilist.length < 3) return;
		this.length = Integer.parseInt(ilist[2]);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String getValue() {
		return DataUtil.mkData(this, "A");
	}
}
