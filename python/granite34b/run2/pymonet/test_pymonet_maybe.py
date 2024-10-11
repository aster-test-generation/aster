from pymonet.maybe import Maybe, Just, Nothing


class TestMaybe:
    def test_just_value(self):
        assert Maybe.just(1).value == 1

    def test_just_is_nothing(self):
        assert Maybe.just(1).is_nothing == False

    def test_nothing_value(self):
        assert Maybe.nothing().value is None

    def test_nothing_is_nothing(self):
        assert Maybe.nothing().is_nothing == True

    def test_map_just(self):
        assert Maybe.just(1).map(lambda x: x + 1).value == 2

    def test_map_nothing(self):
        assert Maybe.nothing().map(lambda x: x + 1).is_nothing == True

    def test_bind_just(self):
        assert Maybe.just(1).bind(lambda x: Maybe.just(x + 1)).value == 2

    def test_bind_nothing(self):
        assert Maybe.nothing().bind(lambda x: Maybe.just(x + 1)).is_nothing == True

    def test_ap_just(self):
        assert Maybe.just(lambda x: x + 1).ap(Maybe.just(1)).value == 2

    def test_ap_nothing(self):
        assert Maybe.just(lambda x: x + 1).ap(Maybe.nothing()).is_nothing == True

    def test_filter_just_true(self):
        assert Maybe.just(1).filter(lambda x: x > 0).value == 1

    def test_filter_just_false(self):
        assert Maybe.just(1).filter(lambda x: x > 1).is_nothing == True

    def test_filter_nothing(self):
        assert Maybe.nothing().filter(lambda x: x > 0).is_nothing == True

    def test_get_or_else_just(self):
        assert Maybe.just(1).get_or_else(0) == 1

    def test_get_or_else_nothing(self):
        assert Maybe.nothing().get_or_else(0) == 0

    def test_to_either_just(self):
        from pymonet.either import Right
        assert Maybe.just(1).to_either() == Right(1)

    def test_to_either_nothing(self):
        from pymonet.either import Left
        assert Maybe.nothing().to_either() == Left(None)

    def test_to_box_just(self):
        from pymonet.box import Box
        assert Maybe.just(1).to_box() == Box(1)

    def test_to_box_nothing(self):
        from pymonet.box import Box
        assert Maybe.nothing().to_box() == Box(None)

    def test_to_lazy_just(self):
        from pymonet.lazy import Lazy
        assert Maybe.just(1).to_lazy().value == 1

    def test_to_lazy_nothing(self):
        from pymonet.lazy import Lazy
        assert Maybe.nothing().to_lazy().value is None

    def test_to_try_just(self):
        from pymonet.monad_try import Try
        assert Maybe.just(1).to_try().value == 1

    def test_to_try_nothing(self):
        from pymonet.monad_try import Try
        assert Maybe.nothing().to_try().value is None

    def test_to_validation_just(self):
        from pymonet.validation import Validation
        assert Maybe.just(1).to_validation() == Validation.success(1)

if __name__ == '__main__':
    unittest.main()