
class KidsMealBuilder 
  def build_drink
  end

  def build_main
  end

  def build_dessert
  end

  def get_meal
  end
end

class AdultMealBuilder 
  def build_drink
  end

  def build_main
  end

  def build_dessert
  end

  def get_meal
  end
end

class MealDirector
  def create_meal(meal_builder)
    builder.build_drink
    builder.build_main
    builder.build_dessert
    builder.get_meal
  end
end

directory = MealDirector.new
builder = nil
if true
  builder = KidsMealBuilder.new
else
  builder = AdultMealBuilder.new
end
director.create_meal(builder)
