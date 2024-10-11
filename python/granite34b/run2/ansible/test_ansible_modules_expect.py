import unittest
from ansible.modules.expect import *


class TestExpectModule(unittest.TestCase):
    def test_response_closure(self):
        module = AnsibleModule()
        question = "What is your name?"
        responses = ["John", "Doe"]
        resp_gen = (b'%s\n' % to_bytes(r).rstrip(b'\n') for r in responses)
        def wrapped(info):
            try:
                return next(resp_gen)
            except StopIteration:
                module.fail_json(msg="No remaining responses for '%s', "
                                     "output was '%s'" %
                                     (question,
                                      info['child_result_list'][-1]))
        result = response_closure(module, question, responses)
        self.assertEqual(result, b'John\n')

    def test_main(self):
        module = AnsibleModule()
        args = "ls -l"
        chdir = "/tmp"
        creates = "/tmp/test_file"
        removes = "/tmp/test_file"
        responses = {"What is your name?": "John"}
        timeout = 30
        echo = False
        events = dict()
        for key, value in responses.items():
            if isinstance(value, list):
                response = response_closure(module, key, value)
            else:
                response = b'%s\n' % to_bytes(value).rstrip(b'\n')
            events[to_bytes(key)] = response
        result = main(module, args, chdir, creates, removes, responses, timeout, echo)
        self.assertEqual(result['cmd'], args)
        self.assertEqual(result['stdout'], "skipped, since %s does not exist" % removes)
        self.assertEqual(result['rc'], 0)

if __name__ == '__main__':
    unittest.main()