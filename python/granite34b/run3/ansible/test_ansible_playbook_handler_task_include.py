import unittest
from ansible.playbook.handler_task_include import HandlerTaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load_method(self):
        data = {}  # Replace with actual data
        handler = HandlerTaskInclude.load(data, None, None)
        self.assertIsInstance(handler, HandlerTaskInclude)

    def test_valid_include_keywords(self):
        self.assertIn('listen', HandlerTaskInclude.VALID_INCLUDE_KEYWORDS)

    def test_str_method(self):
        handler = HandlerTaskInclude()
        result = handler.__str__()
        self.assertEqual(result, 'HandlerTaskInclude')

    def test_repr_method(self):
        handler = HandlerTaskInclude()
        result = handler.__repr__()
        self.assertEqual(result, 'HandlerTaskInclude()')

    def test_eq_method(self):
        handler1 = HandlerTaskInclude()
        handler2 = HandlerTaskInclude()
        self.assertEqual(handler1, handler2)

if __name__ == '__main__':
    unittest.main()