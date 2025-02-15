from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print("Title of the page is "+driver.title)

    rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
    print("No. of rows are : " + str(len(rows)))

    columns = driver.find_elements(By.XPATH, "//table/tbody/tr[1]/td")
    print("No. of rows are : " + str(len(columns)))

    third_Row_Values = driver.find_elements(By.XPATH, "//table/tbody/tr[3]/td")
    print("Third Row Values are: ")
    for value in third_Row_Values:
        print(value.text)

    second_row_column = driver.find_element(By.XPATH, "//table/tbody/tr[2]/td[2]")
    print("Second row and second column value is : " + second_row_column.text)

    driver.close()

