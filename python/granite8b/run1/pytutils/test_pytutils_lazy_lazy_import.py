import math
import unittest
from pytutils.lazy.lazy_import import lazy_import
    def test_lazy_import_with_from_import(self):
        scope = {}
        lazy_import(scope, 'from math import pi as pi_value')
        self.assertTrue(hasattr(scope, 'pi'))
    def test_lazy_import_with_from_import_and_alias(self):
        scope = {}
        lazy_import(scope, 'from math import pi as p')
        self.assertTrue(hasattr(scope, 'p'))
    def test_lazy_import_with_from_import_and_multiple_items(self):
        scope = {}
        lazy_import(scope, 'from math import pi, e')
        self.assertTrue(hasattr(scope, 'pi'))
    def test_lazy_import_with_from_import_and_multiple_items_and_alias(self):
        scope = {}
        lazy_import(scope, 'from math import pi as p, e as E')
        self.assertTrue(hasattr(scope, 'p'))
    def test_lazy_import_with_from_import_and_wildcard(self):
        scope = {}
        lazy_import(scope, 'from math import *')
        self.assertTrue(hasattr(scope, 'pi'))
    def test_lazy_import_with_from_import_and_wildcard_and_alias(self):
        scope = {}
        lazy_import(scope, 'from math import * as m')
        self.assertTrue(hasattr(scope, 'm'))


class TestLazyImport(unittest.TestCase):
    def test_lazy_import(self):
        scope = {}
        lazy_import(scope, 'import math')
        self.assertTrue(hasattr(scope, 'math'))
        self.assertEqual(scope['math'], math)

    def test_lazy_import_with_alias(self):
        scope = {}
        lazy_import(scope, 'import math as m')
        self.assertTrue(hasattr(scope, 'm'))
        self.assertEqual(scope['m'], math)

        self.assertEqual(scope['pi'], math.pi)

        self.assertEqual(scope['p'], math.pi)

        self.assertTrue(hasattr(scope, 'e'))
        self.assertEqual(scope['pi'], math.pi)
        self.assertEqual(scope['e'], math.e)

        self.assertTrue(hasattr(scope, 'E'))
        self.assertEqual(scope['p'], math.pi)
        self.assertEqual(scope['E'], math.e)

        self.assertTrue(hasattr(scope, 'e'))
        self.assertEqual(scope['pi'], math.pi)
        self.assertEqual(scope['e'], math.e)

        self.assertTrue(hasattr(scope['m'], 'pi'))
        self.assertTrue(hasattr(scope['m'], 'e'))
        self.assertEqual(scope['m']['pi'], math.pi)
        self.assertEqual(scope['m']['e'], math.e)

if __name__ == '__main__':
    unittest.main()