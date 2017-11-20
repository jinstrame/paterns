package instantiate.builder;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Burger {

    private boolean cheese;
    private boolean tomato;
    private boolean chili;
    private boolean iceberg;


    private Burger(BurgerBuilder burgerBuilder) {
        this.cheese = burgerBuilder.cheese;
        this.tomato = burgerBuilder.tomato;
        this.chili = burgerBuilder.chili;
        this.iceberg = burgerBuilder.iceberg;
    }

    public static BurgerBuilder builder() {
        return new BurgerBuilder();
    }

    public static class BurgerBuilder {
        private boolean cheese;
        private boolean tomato;
        private boolean chili;
        private boolean iceberg;

        public BurgerBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder chili(boolean chili) {
            this.chili = chili;
            return this;
        }

        public BurgerBuilder iceberg(boolean iceberg) {
            this.iceberg = iceberg;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
