# Kata – Tax Calculation

A value-added tax of 10% is applied to each product, except for books, food, and medicine, which are exempt.

An additional tax of 5% is applied to imported products, without exception.

The amount of each tax is rounded up to the nearest 5 cents, according to the following rule:

| Calculated Tax | Imposed Tax	 | 
|----------------|--------------|
| 0.99	          | 1.00         |
| 1.01           | 1.02         |
| 1.00	          | 1.00         |
| 1.05	          | 1.05         |

When placing an order, an invoice is issued listing each product along with its price including taxes; at the bottom of
the invoice are the total price (including taxes) and the total amount of taxes.
The total price including taxes is calculated as follows:

> Ptotal = PWithout Tax + sum(rounded(PWithout Tax * Tax/100))

1. Write an application, executable on a JVM, which prints the detailed invoice for each of the following baskets:

   Input 1: 1 book at 12.49, 1 music CD at 14.99, 1 chocolate bar at 0.85<br/>
   Output 1:<br/>
   &nbsp;&nbsp;&nbsp;1 book: 12.49 <br/>
   &nbsp;&nbsp;&nbsp;1 music CD: 16.49 <br/>
   &nbsp;&nbsp;&nbsp;1 chocolate bar: 0.85<br/>
   &nbsp;&nbsp;&nbsp;Amount of taxes: 1.50<br/>
   &nbsp;&nbsp;&nbsp;Total : 29.83<br/>

   Input 2: 1 imported box of chocolate at 10.00, 1 imported bottle of perfume at 47.50<br/>
   Output 2:<br>
   &nbsp;&nbsp;&nbsp;1 imported box of chocolate: 10.50<br/>
   &nbsp;&nbsp;&nbsp;1 imported bottle of perfume: 54.65<br/>
   &nbsp;&nbsp;&nbsp;Amount of taxes: 7.65<br/>
   &nbsp;&nbsp;&nbsp;Total : 65.15<br/>

   Input 3: 1 imported bottle of perfume at 27.99, 1 bottle of perfume at 18.99, 1 box migraine pills at 9.75, 1
   imported box of chocolates at 11.25<br>
   Output 3:<br/>
   &nbsp;&nbsp;&nbsp;1 imported bottle of perfume: 32.19<br/>
   &nbsp;&nbsp;&nbsp;1 bottle of perfume: 20.89<br/>
   &nbsp;&nbsp;&nbsp;1 box migraine pills: 9.75<br/>
   &nbsp;&nbsp;&nbsp;1 imported box of chocolates: 11.85<br/>
   &nbsp;&nbsp;&nbsp;Amount of taxes: 6.70<br/>
   &nbsp;&nbsp;&nbsp;Total: 74.68<br/><br/>

2. Add a new Tax for Luxury Product of 10%. Any kind of Product can be a Luxury Product.
3. Healthy Tax. If the weight of Sugar in the food is greater than 5% of the total weight of the food, an extra tax of 10% is applied.
