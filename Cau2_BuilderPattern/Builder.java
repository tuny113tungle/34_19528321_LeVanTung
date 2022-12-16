package Cau2_BuilderPattern;

public interface Builder {
	
	Builder setId(String id);
	
	Builder setHoTen(String hoTen);
	Builder setNgaySinh(String NgaySinh);
	Builder setChucVi(String ChucVi);
	Builder setBoMon(String BoMon);
	Tescher build();
}
