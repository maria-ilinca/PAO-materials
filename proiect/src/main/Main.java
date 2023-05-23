package main;

import models. *;
import services. *;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ShopService shopService = new ShopService();

        ProductService productService = new ProductService();

        AngajatService angajatService = new AngajatService();

        ClientService clientService = new ClientService();

        while (true) {

            System.out.println("Alegeti o optiune:");
            System.out.println("1. Adauga magazin");
            System.out.println("2. Adauga angajat");
            System.out.println("3. Adauga client");
            System.out.println("4. Adauga produs");
            System.out.println("5. Afiseaza clientii care au facut cumparaturi in ultima luna");
            System.out.println("6. Afiseaza valoarea maxima a cumparaturilor unor clienti");
            System.out.println("7. Afiseaza toate magazinele");
            System.out.println("8. Afiseaza toate produsele dintr-un magazin");
            System.out.println("9. Afiseaza toti angajatii");
            System.out.println("10. Afiseaza toti clientii");
            System.out.println("11. Afiseaza caloriile de la toate produsele de tip mancare");
            System.out.println("12. Afiseaza toate bauturile alcoolice");
            System.out.println("13. Afiseaza toate hainele sortate dupa marime");
            System.out.println("14. Verifica daca un produs de tipul mancare e expirat");
            // pentru angajatii cu hiredate cu 5 ani in urma se va actualiza salariul cu 15%
            System.out.println("15. Actualizeaza salariul angajatilor");
            System.out.println("16. Iesire");



            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Introduceti numele magazinului");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.next();
                    System.out.println("Introduceti adresa magazinului");
                    Scanner scanner2 = new Scanner(System.in);
                    String address = scanner2.next();
                    Shop shop = new Shop(name, address, null);
                    shopService.addShop(shop);
                    break;
                case 2:
                    System.out.println("Introduceti numele angajatului");
                    Scanner scanner3 = new Scanner(System.in);
                    String name1 = scanner3.next();
                    System.out.println("Introduceti cnp-ul angajatului");
                    String cnp1 = scanner.next();
                    System.out.println("Introduceti job-ul angajatului");
                    String job = scanner.next();
                    System.out.println("Introduceti salariul angajatului");
                    Integer salary = scanner.nextInt();
                    System.out.println("Introduceti data angajarii angajatului");
                    String hireDate = scanner.next();

                    java.util.Date sdate = (new java.util.Date(hireDate));
                    Date date = new Date(sdate.getTime());

                    // converteste stringul in data

                    Angajat angajat = new Angajat(name1, null, cnp1, job, salary, date);
                    angajatService.addAngajat (angajat);
                    break;
                case 3:
                    System.out.println("Introduceti numele clientului");
                    Scanner scanner4 = new Scanner(System.in);
                    String name2 = scanner4.next();
                    System.out.println("Introduceti cnp-ul clientului");
                    String cnp2 = scanner.next();
                    System.out.println("Introduceti data cumparaturilor");
                    String purchaseDate = scanner.next();
                    java.util.Date sdate1 = new java.util.Date(purchaseDate);
                    Date date1 = new Date(sdate1.getTime());
                    // converteste stringul in data
                    System.out.println("Introduceti suma cumparaturilor");
                    Integer purchaseSum = scanner.nextInt();
                    Client client = new Client(name2, null, cnp2, date1, purchaseSum);
                    clientService.addClient(client);
                    break;
                case 4:
                    System.out.println("Introduceti numele produsului");
                    Scanner scanner5 = new Scanner(System.in);
                    String name3 = scanner5.next();
                    System.out.println("Introduceti pretul produsului");
                    Integer price = scanner.nextInt();
                    System.out.println("Introduceti cantitatea produsului");
                    Integer quantity = scanner.nextInt();
                    System.out.println("Introduceti tipul produsului");
                    String type = scanner.next();
                    if (type.equals("alimentar")) {
                        System.out.println("Introduceti data expirarii");
                        String expirationDate = scanner.next();
                        java.util.Date sdate2 = new java.util.Date(expirationDate);
                        Date date2 = new Date(sdate2.getTime());
                        System.out.println("Introduceti cantitatea produsului");
                        Integer quantityfood = scanner.nextInt();
                        System.out.println("Introduceti producatorul produsului");
                        Scanner scanner6 = new Scanner(System.in);
                        String producer = scanner6.next();
                        System.out.println("Introduceti calorile produsului");
                        Integer calories = scanner.nextInt();
                        System.out.println("Introduceti ingredientele produsului");
                        Scanner scanner7 = new Scanner(System.in);
                        String ingredients = scanner7.next();
                        // make a list of ingredients
                        List< String > ingredientsList = new ArrayList < > ();
                        // split the string by comma
                        String[] ingredientsArray = ingredients.split(",");
                        // add the ingredients to the list
                        for (String ingredient: ingredientsArray) {
                            ingredientsList.add(ingredient);
                        }
                        System.out.println("Introduceti daca este Vegetarian");
                        Boolean isVegetarian = scanner.nextBoolean();
                        System.out.println("Introduceti daca este Vegan");
                        Boolean isVegan = scanner.nextBoolean();
                        Food mancare = new Food(name3, null, price, quantity, date2, producer,quantityfood, calories, ingredientsList, isVegetarian, isVegan );
                        productService.addProduct(mancare);
                    } else if (type.equals( "bautura")) {
                        System.out.println("Introduceti producatorul produsului");
                        Scanner scanner8 = new Scanner(System.in);
                        String producer = scanner8.next();
                        System.out.println("Introduceti data expirarii");
                        String expirationDate = scanner.next();
                        java.util.Date sdate3 = new java.util.Date(expirationDate);
                        Date date3 = new Date(sdate3.getTime());
                        System.out.println("Introduceti volumul bauturii");
                        Integer volume = scanner.nextInt();
                        System.out.println("Introduceti daca este alcoolica");
                        Boolean isAlcoholic = scanner.nextBoolean();
                        Drink bautura = new Drink(name3, null, price,quantity, producer, date3, volume, isAlcoholic );
                        productService.addProduct(bautura);
                    }
                    else if (type.equals( "haina")){
                    System.out.println("Introduceti culoarea");
                    String color = scanner.next();
                    System.out.println("Introduceti dimensiunea");
                    String size = scanner.next();
                    System.out.println("Introduceti materialul");
                    String material = scanner.next();
                    Haina haina = new Haina(name3, null, price, quantity, color, size, material);
                    productService.addProduct(haina);
                }
                    break;
                case 5:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id4 = scanner.nextInt();
                    shopService.getShop(id4);
                    clientService.getClientLastMonth();
                    break;
                case 6:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id5 = scanner.nextInt();
                    shopService.getShop(id5);
                    clientService.updateClientPurchase();
                    break;
                case 7:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id6 = scanner.nextInt();
                    shopService.getShop(id6);
                    break;
                case 8:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id7 = scanner.nextInt();
                    shopService.getShop(id7);
                    productService.getProduct();
                    break;
                case 9:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id8 = scanner.nextInt();
                    shopService.getShop(id8);
                    angajatService.getAngajat();
                    break;
                case 10:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id9 = scanner.nextInt();
                    shopService.getShop(id9);
                    clientService.getClient();
                    break;
                case 11:
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id10 = scanner.nextInt();
                    shopService.getShop(id10);
                    productService.getCalories();
                    break;
                case 12:
                    // returneaza toate bauturile alcoolice
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id11 = scanner.nextInt();
                    shopService.getShop(id11);
                    productService.getAlcohol();
                    break;
                case 13:
                    //  sorteaza produsele de tip haina dupa marime
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id12 = scanner.nextInt();
                    shopService.getShop(id12);
                    productService.sortClothesBySize();
                    break;
                case 14:
                    // verifica daca un produs de tipul mancare e expirat
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id13 = scanner.nextInt();
                    shopService.getShop(id13);
                    productService.checkExpirationDate();
                    break;
                case 15:
                    // pentru angajatii cu hiredate cu 5 ani in urma se va actualiza salariul cu 15%
                    shopService.getAllShops();
                    System.out.println("Alege un magazin");
                    Integer id14 = scanner.nextInt();
                    shopService.getShop(id14);
                    angajatService.updateAngajatSalary();

                case 16:
                    System.out.println("Ciao ragazzi!");
                    System.exit(0);

            }
        }
    }
}
