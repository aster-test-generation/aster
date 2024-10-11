import unittest
from ansible.plugins.lookup import subelements



class TestLookupModule(unittest.TestCase):
    def test_run(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_2(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_3(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_4(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_5(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_6(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_7(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_8(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_run_9(self):
        terms = [1, 2, 3]
        variables = [4, 5, 6]
        kwargs = {7: 8}
        instance = LookupModule()
        result = instance.run(terms, variables, **kwargs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

if __name__ == '__main__':
    unittest.main()