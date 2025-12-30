const fruits = ["Apple", "Banana", "Mango"];
function FruitList() {
  return (
    <ul>
      {fruits.map((fruit, index) => <li key={index}>{fruit}</li>)}
    </ul>
  );
}
