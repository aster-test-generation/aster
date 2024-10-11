from pymonet.monad_try import Try

def test_try_of():
    def divide(x, y):
        return x / y
    result = Try.of(divide, 10, 2)
    assert result.value == 5
    assert result.is_success

def test_try_map():
    result = Try(10, True).map(lambda x: x + 1)
    assert result.value == 11
    assert result.is_success

def test_try_bind():
    result = Try(10, True).bind(lambda x: Try(x + 1, True))
    assert result.value == 11
    assert result.is_success

def test_try_on_success():
    called = False
    def callback(value):
        nonlocal called
        called = True
    result = Try(10, True).on_success(callback)
    assert called

def test_try_on_fail():
    called = False
    def callback(value):
        nonlocal called
        called = True
    result = Try(10, True).on_fail(callback)
    assert not called

def test_try_filter():
    result = Try(10, True).filter(lambda x: x > 5)
    assert result.value == 10
    assert result.is_success

def test_try_get():
    result = Try(10, True).get()
    assert result == 10

def test_try_get_or_else():
    result = Try(10, True).get_or_else(0)
    assert result == 10

def test_try_eq():
    result1 = Try(10, True)
    result2 = Try(10, True)
    assert result1 == result2

if __name__ == '__main__':
    unittest.main()