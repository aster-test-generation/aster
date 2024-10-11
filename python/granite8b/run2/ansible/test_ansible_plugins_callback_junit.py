from ansible.plugins.callback import junit


class TestExampleClass:
    def test_method_one(self):
        instance = ansible.plugins.callback.junit.ExampleClass()
        result = instance.method_one(1)
        assert result == 2

    def test_method_two(self):
        instance = ansible.plugins.callback.junit.ExampleClass()
        result = instance.method_two(2)
        assert result == 4

    def test_protected_method(self):
        instance = ansible.plugins.callback.junit.ExampleClass()
        result = instance._protected_method(3)
        assert result == 6

    def test_private_method(self):
        instance = ansible.plugins.callback.junit.ExampleClass()
        result = instance._ExampleClass__private_method(3)
        assert result == 9

    def test_str_method(self):
        instance = ansible.plugins.callback.junit.ExampleClass()
        result = instance.__str__()
        assert result == "ExampleClass"

    def test_repr_method(self):
        instance = ansible.plugins.callback.junit.ExampleClass()
        result = instance.__repr__()
        assert result == "ExampleClass(1)"

if __name__ == '__main__':
    unittest.main()