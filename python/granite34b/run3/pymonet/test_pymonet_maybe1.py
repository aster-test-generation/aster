from pymonet.maybe import Maybe

def test_just():
    assert Maybe.just(1).value == 1
    assert Maybe.just(1).is_nothing == False

def test_nothing():
    assert Maybe.nothing().value is None
    assert Maybe.nothing().is_nothing == True

def test_map():
    assert Maybe.just(1).map(lambda x: x + 1).value == 2
    assert Maybe.just(1).map(lambda x: x + 1).is_nothing == False
    assert Maybe.nothing().map(lambda x: x + 1).is_nothing == True

def test_bind():
    assert Maybe.just(1).bind(lambda x: Maybe.just(x + 1)).value == 2
    assert Maybe.just(1).bind(lambda x: Maybe.just(x + 1)).is_nothing == False
    assert Maybe.nothing().bind(lambda x: Maybe.just(x + 1)).is_nothing == True

def test_ap():
    assert Maybe.just(1).ap(Maybe.just(lambda x: x + 1)).value == 2
    assert Maybe.just(1).ap(Maybe.just(lambda x: x + 1)).is_nothing == False
    assert Maybe.nothing().ap(Maybe.just(lambda x: x + 1)).is_nothing == True

def test_filter():
    assert Maybe.just(1).filter(lambda x: x > 0).value == 1
    assert Maybe.just(1).filter(lambda x: x > 0).is_nothing == False
    assert Maybe.just(1).filter(lambda x: x < 0).is_nothing == True
    assert Maybe.nothing().filter(lambda x: x > 0).is_nothing == True

def test_get_or_else():
    assert Maybe.just(1).get_or_else(0) == 1
    assert Maybe.nothing().get_or_else(0) == 0

def test_to_either():
    from pymonet.either import Left, Right
    assert Maybe.just(1).to_either() == Right(1)
    assert Maybe.nothing().to_either() == Left(None)

def test_to_box():
    from pymonet.box import Box
    assert Maybe.just(1).to_box().value == 1
    assert Maybe.nothing().to_box().value is None

def test_to_lazy():
    from pymonet.lazy import Lazy
    assert Maybe.just(1).to_lazy().value == 1
    assert Maybe.nothing().to_lazy().value is None

def test_to_try():
    from pymonet.monad_try import Try
    assert Maybe.just(1).to_try().value == 1
    assert Maybe.just(1).to_try().is_success == True
    assert Maybe.nothing().to_try().is_success == False

if __name__ == '__main__':
    unittest.main()