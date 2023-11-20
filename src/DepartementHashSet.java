import java.util.*;

public class DepartementHashSet<T extends département> implements IDépartement<T> {
    private Set<T> listeDepartements;

    public DepartementHashSet() {
        listeDepartements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(T t) {
        listeDepartements.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (T departement : listeDepartements) {
            if (departement.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(T t) {
        return listeDepartements.contains(t);
    }

    @Override
    public void supprimerDepartement(T t) {
        listeDepartements.remove(t);
    }

    @Override
    public void displayDepartement() {
        for (T departement : listeDepartements) {
            System.out.println(departement.toString());
        }
    }
    @Override
    public TreeSet<T> trierDepartementById() {
        TreeSet<T> sortedDepartements = new TreeSet<>(new DepartementComparator());
        sortedDepartements.addAll(listeDepartements);
        return sortedDepartements;
    }

    // Comparator pour trier les départements par ID
    private class DepartementComparator implements Comparator<T> {
        @Override
        public int compare(T departement1, T departement2) {
            return Integer.compare(departement1.getId(), departement2.getId());
        }
    }


}

