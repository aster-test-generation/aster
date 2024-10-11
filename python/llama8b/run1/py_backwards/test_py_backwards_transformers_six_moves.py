import unittest
import six_moves as s


class TestSixMovesTransformer(unittest.TestCase):
    def test_get_rewrites(self):
        transformer = SixMovesTransformer()
        rewrites = list(transformer._get_rewrites())
        self.assertEqual(len(rewrites), 44)

    def test_rewrite(self):
        transformer = SixMovesTransformer()
        rewrites = list(transformer._get_rewrites())
        for path, new_path in rewrites:
            self.assertEqual(transformer.rewrite(path), new_path)

    def test_init(self):
        transformer = SixMovesTransformer()
        self.assertEqual(transformer.target, (2, 7))

    def test_str(self):
        transformer = SixMovesTransformer()
        self.assertEqual(str(transformer), "SixMovesTransformer")

    def test_repr(self):
        transformer = SixMovesTransformer()
        self.assertEqual(repr(transformer), "SixMovesTransformer((2, 7))")

    def test_eq(self):
        transformer1 = SixMovesTransformer()
        transformer2 = SixMovesTransformer()
        self.assertEqual(transformer1, transformer2)

    def test_ne(self):
        transformer1 = SixMovesTransformer()
        transformer2 = object()
        self.assertNotEqual(transformer1, transformer2)

if __name__ == '__main__':
    unittest.main()