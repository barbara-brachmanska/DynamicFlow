Feature: Want to search some product on www.allegro.pl

  Scenario Outline: Want to search for men shoes
    Given opened the "http://www.allegro.pl" site
    When click on Kategorie lookup list and select <subcategory1> <subcategory2>
    Then list of available offers is shown

    Examples:
      | subcategory1 | subcategory2 |
      | Elektronika  | Komputery    |
      | Moda         | Obuwie       |

  Scenario Outline: display product description
    Given opened the "https://allegro.pl/kategoria/komputery" site
    When <product> is selected
    Then auction details page is shown

    Examples:
      | product |
      | 0       |
      | 1       |