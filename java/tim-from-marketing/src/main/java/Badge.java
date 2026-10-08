class Badge {
    public String print(Integer id, String name, String department) {
        String idPortion = id != null ? String.format("[%d] - ", id) : "";
        String departmentPortion = department != null ? department.toUpperCase() : "OWNER";

        return idPortion + name + " - " + departmentPortion;
    }
}
