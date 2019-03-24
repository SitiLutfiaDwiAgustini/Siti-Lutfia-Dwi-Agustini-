public class ProgramSTNK
{
	public static void main (String [] args)
	{
		STNK stnk = new STNK(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16]);
		
		String no_registrasi = stnk.getNo_registrasi();
		String nm_pemilik = stnk.getNm_pemilik();
		String alamat = stnk.getAlamat();
		String merk = stnk.getMerk();
		String type = stnk.getType();
		String jenis = stnk.getJenis();
		String model = stnk.getModel();
		String thn_pembuatan = stnk.getThn_pembuatan();
		String isi_silinder = stnk.getIsi_silinder();
		String no_rangkaNIK = stnk.getNo_rangkaNIK();
		String no_mesin = stnk.getNo_mesin();
		String warna = stnk.getWarna();
		String bahan_bakar = stnk.getBahan_bakar();
		String warna_TNKB = stnk.getWarna_TNKB();
		String thn_registrasi = stnk.getThn_registrasi();
		String no_bpkb = stnk.getNo_bpkb();
		String berlaku_sampai = stnk.getBerlaku_sampai();
		
		System.out.println(no_registrasi);
		System.out.println(nm_pemilik);
		System.out.println(alamat);
		System.out.println(merk);
		System.out.println(type);
		System.out.println(jenis);
		System.out.println(model);
		System.out.println(thn_pembuatan);
		System.out.println(isi_silinder);
		System.out.println(no_rangkaNIK);
		System.out.println(no_mesin);
		System.out.println(warna);
		System.out.println(bahan_bakar);
		System.out.println(warna_TNKB);
		System.out.println(thn_registrasi);
		System.out.println(no_bpkb);
		System.out.println(berlaku_sampai);
		
	}
}