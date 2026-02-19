package com.gla;

public class Library {
    private int quantity;
    private Admin admin;
    public LibraryRepository LibraryRepository = new LibraryRepository();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public LibraryRepository getLibraryRepository() {
        return LibraryRepository;
    }

    public void setLibraryRepository(LibraryRepository libraryRepository) {
        LibraryRepository = libraryRepository;
    }
}
