package infonpm;

class PerhitunganNilai extends NilaiSiswa {
    private double absen;

    public PerhitunganNilai(double tugas, double uts, double uas, double absen) {
        super(tugas, uts, uas);
        this.absen = absen;
    }

    public void info() {
        double total = (getTugas() * 0.10) + (getUts() * 0.20) + (getUas() * 0.30) + (absen * 0.40);
        String grade = grade(total);

        System.out.println("Nilai tugas: " + getTugas());
        System.out.println("Nilai UTS: " + getUts());
        System.out.println("Nilai UAS: " + getUas());
        System.out.println("Nilai total: " + total);
        System.out.println("Nilai grade: " + grade);
    }

    private String grade(double total) {
        if (total >= 85) {
            return "A";
        } else if (total >= 70) {
            return "B";
        } else if (total >= 55) {
            return "C";
        } else if (total >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
}

